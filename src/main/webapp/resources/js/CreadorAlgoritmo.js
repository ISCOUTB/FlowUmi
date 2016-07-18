var tipoNodo;
var numeroNodos;
var ids = [];

Element.prototype.remove = function() {
    this.parentElement.removeChild(this);
}
NodeList.prototype.remove = HTMLCollection.prototype.remove = function() {
    for(var i = 0, len = this.length; i < len; i++) {
        if(this[i] && this[i].parentElement) {
            this[i].parentElement.removeChild(this[i]);
        }
    }
}

function setTipoNodo(tipo) {
    tipoNodo = tipo;
}
function setNumeroNodos(numero) {
    numeroNodos = numero;
}
function getTipoNodo() {
    return tipoNodo;
}
function getNumeroNodos() {
    return numeroNodos;
}

$(document).ready(function() {
    tipoNodo = 2;
    jsPlumb.importDefaults({
        Endpoint: ["Dot", {
            radius: 5
        }],
        HoverPaintStyle: {
            strokeStyle: "#42a62c",
            lineWidth: 2
        },
        ConnectionOverlays: [
        ["Arrow", {
            location: 1,
            id: "arrow",
            length: 14,
            foldback: 0.8
        }],
        ["Label", {
            label: "",
            id: "label"
        }]
        ]
    });


    jsPlumb.bind("jsPlumbConnection", function(conn) {
        conn.connection.setPaintStyle({
            strokeStyle: '#000000'
        });
    });
    jsPlumb.bind("click", function(c) {
        jsPlumb.detach(c);
    });
    //Setting up new nodes
    $('#container').dblclick(function(e) {
        var position = getCursorPosition('#container', e);
        if (tipoNodo == 2) {
            makeAsignacion(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 3) {
            makeMientras(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 4) {
            makeSi(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 5) {
            makeSiNo(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 6) {
            makePara(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 7) {
            makeLectura(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 8) {
            makeEscritura(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 9) {
            makeFuncion(position[1] - 50, position[0] - 50);
        }
        if (tipoNodo == 10) {
            makeBreak(position[1] - 50, position[0] - 50);
        }

    });
});

function getCursorPosition(canvas, event) {
    var x, y;

    canoffset = $(canvas).offset();
    x = event.clientX + document.body.scrollLeft + document.documentElement.scrollLeft - Math.floor(canoffset.left);
    y = event.clientY + document.body.scrollTop + document.documentElement.scrollTop - Math.floor(canoffset.top) + 1;

    return [x, y];
}

HTMLCanvasElement.prototype.relMouseCoords = function(event) {
    var totalOffsetX = 0;
    var totalOffsetY = 0;
    var canvasX = 0;
    var canvasY = 0;
    var currentElement = this;

    do {
        totalOffsetX += currentElement.offsetLeft;
        totalOffsetY += currentElement.offsetTop;
    }
    while (currentElement = currentElement.offsetParent)

    canvasX = event.pageX - totalOffsetX;
    canvasY = event.pageY - totalOffsetY;

    // Fix for variable canvas width
    canvasX = Math.round(canvasX * (this.width / this.offsetWidth));
    canvasY = Math.round(canvasY * (this.height / this.offsetHeight));

    return {
        x: canvasX,
        y: canvasY
    }
}

//Bloques
function makeInicio(x, y) {
    var inicio = $('<div>').attr('id', 'inicio' + numeroNodos).addClass('inicio').text('Inicio - ' + numeroNodos);
    var fin = $('<div>').attr('id', 'fin' + numeroNodos).addClass('fin').text('Fin - ' + numeroNodos);
    var inicios = $('<div>').attr('id', 'inicios' + numeroNodos).addClass('whites');
    ids[ids.length] = 'inicio' + numeroNodos;
    ids[ids.length] = 'fin' + numeroNodos;
    inicio.append(inicios);
    inicio.css({
        'top': x,
        'left': y
    });
    fin.css({
        'top': x + 100,
        'left': y + 100
    })
    $('#container').append(inicio);
    $('#container').append(fin);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#inicio" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(inicio);
    jsPlumb.draggable(fin);
    jsPlumb.makeSource(inicios, Endpoint);
    jsPlumb.makeTarget(fin, {
        anchor: "Continuous"
    });
    jsPlumb.connect({
        source: inicio,
        target: fin
    });
    numeroNodos++;
}
function makeBreak(x, y) {
    var Break = $('<div>').attr('id', 'break' + numeroNodos).addClass('break').text('Break - ' + numeroNodos);
    var breaks = $('<div>').attr('id', 'breaks' + numeroNodos).addClass('whites');
    ids[ids.length] = 'break' + numeroNodos;
    Break.append(breaks);
    Break.css({
        'top': x,
        'left': y
    });
    $('#container').append(Break);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#break" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(Break);
    jsPlumb.makeSource(breaks, Endpoint);
    jsPlumb.makeTarget(Break, {
        anchor: "Continuous"
    });
    numeroNodos++;
}
function makeAsignacion(x, y) {
    var asignacion = $('<div>').attr('id', 'asignacion' + numeroNodos).addClass('asignacion').text('Asignacion - ' + numeroNodos);
    var asignacions = $('<div>').attr('id', 'asignacions' + numeroNodos).addClass('browns');
    ids[ids.length] = 'asignacion' + numeroNodos;
    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    asignacion.append(input);
    asignacion.append(asignacions);
    asignacion.css({
        'top': x,
        'left': y
    });
    $('#container').append(asignacion);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#asignacion" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(asignacion);
    jsPlumb.makeSource(asignacions, Endpoint);
    jsPlumb.makeTarget(asignacion, {
        anchor: "Continuous"
    });
    numeroNodos++;
}
function makeMientras(x, y) {
    var mientras = $('<div>').attr('id', 'mientras' + numeroNodos).addClass('mientras').text('Mientras - ' + numeroNodos);
    var fin = $('<div>').attr('id', 'fin' + numeroNodos).addClass('fin').text('Fin - ' + numeroNodos);
    var mientrass = $('<div>').attr('id', 'inicios' + numeroNodos).addClass('darkred');

    ids[ids.length] = 'mientras' + numeroNodos;
    ids[ids.length] = 'fin' + numeroNodos;



    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    mientras.append(input);
    mientras.append(mientrass);
    mientras.css({
        'top': x,
        'left': y
    });
    fin.css({
        'top': x + 100,
        'left': y + 100
    })
    $('#container').append(mientras);
    $('#container').append(fin);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#mientras" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    var EndpointFin = {
        parent: $("#fin" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 2,
        reattach: true
    };
    var fins = $('<div>').attr('id', 'fins' + numeroNodos).addClass('whites');
    fin.append(fins);
    jsPlumb.makeSource(fins, EndpointFin);
    jsPlumb.draggable(mientras);
    jsPlumb.draggable(fin);
    jsPlumb.makeSource(mientrass, Endpoint);
    jsPlumb.makeTarget(fin, {
        anchor: "Continuous"
    });
    jsPlumb.makeTarget(mientras, {
        anchor: "Continuous"
    });
    jsPlumb.connect({
        source: fin,
        target: mientras,
        reattach: true
    });
    numeroNodos++;
}
function makePara(x, y) {
    var para = $('<div>').attr('id', 'para' + numeroNodos).addClass('para').text('Para - ' + numeroNodos);
    var fin = $('<div>').attr('id', 'fin' + numeroNodos).addClass('fin').text('Fin - ' + numeroNodos);
    var paras = $('<div>').attr('id', 'paras' + numeroNodos).addClass('whites');
    ids[ids.length] = 'para' + numeroNodos;
    ids[ids.length] = 'fin' + numeroNodos;



    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    para.append(input);
    para.append(paras);
    para.css({
        'top': x,
        'left': y
    });
    fin.css({
        'top': x + 100,
        'left': y + 100
    })
    $('#container').append(para);
    $('#container').append(fin);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#para" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    var EndpointFin = {
        parent: $("#fin" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 2,
        reattach: true
    };
    var fins = $('<div>').attr('id', 'fins' + numeroNodos).addClass('whites');
    fin.append(fins);
    jsPlumb.makeSource(fins, EndpointFin);
    jsPlumb.draggable(para);
    jsPlumb.draggable(fin);
    jsPlumb.makeSource(paras, Endpoint);
    jsPlumb.makeTarget(fin, {
        anchor: "Continuous"
    });
    jsPlumb.makeTarget(para, {
        anchor: "Continuous"
    });
    jsPlumb.connect({
        source: fin,
        target: para,
        reattach: true
    });
    numeroNodos++;
}
function makeLectura(x, y) {
    var lectura = $('<div>').attr('id', 'lectura' + numeroNodos).addClass('lectura').text('Lectura - ' + numeroNodos);
    var lecturas = $('<div>').attr('id', 'lecturas' + numeroNodos).addClass('whites');
    ids[ids.length] = 'lectura' + numeroNodos;
    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    lectura.append(input);
    lectura.append(lecturas);
    lectura.css({
        'top': x,
        'left': y
    });
    $('#container').append(lectura);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#lectura" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(lectura);
    jsPlumb.makeSource(lecturas, Endpoint);
    jsPlumb.makeTarget(lectura, {
        anchor: "Continuous"
    });
    numeroNodos++;
}
function makeEscritura(x, y) {
    var escritura = $('<div>').attr('id', 'escritura' + numeroNodos).addClass('escritura').text('Escritura - ' + numeroNodos);
    var escrituras = $('<div>').attr('id', 'escrituras' + numeroNodos).addClass('whites');
    ids[ids.length] = 'escritura' + numeroNodos;
    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    escritura.append(input);
    escritura.append(escrituras);
    escritura.css({
        'top': x,
        'left': y
    });
    $('#container').append(escritura);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#escritura" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(escritura);
    jsPlumb.makeSource(escrituras, Endpoint);
    jsPlumb.makeTarget(escritura, {
        anchor: "Continuous"
    });
    numeroNodos++;
}
function makeFuncion(x, y) {
    var funcion = $('<div>').attr('id', 'funcion' + numeroNodos).addClass('funcion').text('Funcion - ' + numeroNodos);
    var funcions = $('<div>').attr('id', 'funcions' + numeroNodos).addClass('darkred');
    ids[ids.length] = 'funcion' + numeroNodos;
    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    funcion.append(input);
    funcion.append(funcions);
    funcion.css({
        'top': x,
        'left': y
    });
    $('#container').append(funcion);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#funcion" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(funcion);
    jsPlumb.makeSource(funcions, Endpoint);
    jsPlumb.makeTarget(funcion, {
        anchor: "Continuous"
    });
    numeroNodos++;
}
function makeSi(x, y) {
    var si = $('<div>').attr('id', 'si' + numeroNodos).addClass('si').text('SI - ' + numeroNodos);
    var fin = $('<div>').attr('id', 'fin' + numeroNodos).addClass('fin').text('FIN - ' + numeroNodos);
    var siop = $('<div>').attr('id', 'sis' + numeroNodos).addClass('greens');
    ids[ids.length] = 'si' + numeroNodos;
    ids[ids.length] = 'fin' + numeroNodos;



    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    si.append(input);
    si.append(siop);
    si.css({
        'top': x,
        'left': y
    });
    fin.css({
        'top': x + 100,
        'left': y + 100
    })
    $('#container').append(si);
    $('#container').append(fin);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#si" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    var EndpointFin = {
        parent: $("#fin" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 2,
        reattach: true
    };
    var fins = $('<div>').attr('id', 'fins' + numeroNodos).addClass('whites');
    fin.append(fins);
    jsPlumb.makeSource(fins, EndpointFin);
    jsPlumb.draggable(si);
    jsPlumb.draggable(fin);
    jsPlumb.makeSource(siop, Endpoint);
    jsPlumb.makeTarget(si, {
        anchor: "Continuous"
    });
    jsPlumb.makeTarget(fin, {
        anchor: "Continuous"
    });
    jsPlumb.connect({
        source: si,
        target: fin,
        reattach: true
    });
    numeroNodos++;
}
function makeSiNo(x, y) {
    var si = $('<div>').attr('id', 'si' + numeroNodos).addClass('si').text('SI - ' + numeroNodos);
    var sino = $('<div>').attr('id', 'sino' + numeroNodos).addClass('si').text('Sino - ' + numeroNodos);
    var fin = $('<div>').attr('id', 'fin' + numeroNodos).addClass('fin').text('FIN - ' + numeroNodos);
    var sis = $('<div>').attr('id', 'sis' + numeroNodos).addClass('greens');
    var sinos = $('<div>').attr('id', 'sinos' + numeroNodos).addClass('reds');
    ids[ids.length] = 'si' + numeroNodos;
    ids[ids.length] = 'sino' + numeroNodos;
    ids[ids.length] = 'fin' + numeroNodos;




    var input = $('<input>').attr('id', 'text' + numeroNodos).attr('type', 'text').attr('class', 'texto');
    si.append(input);
    si.append(sis);
    sino.append(sinos);
    si.css({
        'top': x,
        'left': y
    });
    sino.css({
        'top': x,
        'left': y + 150
    });
    fin.css({
        'top': x + 100,
        'left': y + 150
    })
    $('#container').append(si);
    $('#container').append(sino);
    $('#container').append(fin);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#si" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 2,
        reattach: true
    };
    var Endpoint2 = {
        parent: $("#sino" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    var EndpointFin = {
        parent: $("#fin" + numeroNodos),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 2,
        reattach: true
    };
    var fins = $('<div>').attr('id', 'fins' + numeroNodos).addClass('whites');
    fin.append(fins);
    jsPlumb.makeSource(fins, EndpointFin);
    jsPlumb.draggable(si);
    jsPlumb.draggable(fin);
    jsPlumb.draggable(sino);
    jsPlumb.makeSource(sis, Endpoint);
    jsPlumb.makeSource(sinos, Endpoint2);
    jsPlumb.makeTarget(si, {
        anchor: "Continuous"
    });
    jsPlumb.makeTarget(sino, {
        anchor: "Continuous"
    });
    jsPlumb.makeTarget(fin, {
        anchor: "Continuous"
    });
    jsPlumb.connect({
        source: si,
        target: sino,
        reattach: true
    });
    jsPlumb.connect({
        source: si,
        target: fin,
        reattach: true
    });
    jsPlumb.connect({
        source: sino,
        target: fin,
        reattach: true
    });
    numeroNodos++;
}

function getNodesInformation() {
    var idsText = "";
    for (indice = 0; indice < ids.length; indice++) {
        var idText = "";
        $('#' + ids[indice]).each(function() {
            idText += $(this).attr("id") + "$";
            idText += $(this).text() + "$";
            idText += $(this).css("top") + "$";
            idText += $(this).css("left") + "$";
            if ($(this).children(".texto").val() != undefined) {
                idText += $(this).children(".texto").val();
            }
        });
        idsText += idText + "$\n";
    }
    return idsText;
}

function getConnectionInformation() {
    var connection = jsPlumb.getAllConnections();
    var connections = "";
    for (var prop in connection) {
        var conns = connection[prop]
        for (var j = 0; j < conns.length; j++) {
            connections += conns[j].sourceId + "$" + conns[j].targetId + "$\n";
        }
    }
    return connections;
}
function makeNodoInicio(x, y, id, texto, numNodo) {
    var inicio = $('<div>').attr('id', id).addClass('inicio').text(texto);
    var inicios = $('<div>').attr('id', 'inicios' + numNodo).addClass('whites');
    ids[ids.length] = id;
    inicio.append(inicios);
    inicio.css({
        'top': x,
        'left': y
    });
    $('#container').append(inicio);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(inicio);
    jsPlumb.makeSource(inicios, Endpoint);
}

function makeNodoFin(x, y, id, texto, numNodo) {
    var fin = $('<div>').attr('id', id).addClass('fin').text(texto);
    ids[ids.length] = id;
    fin.css({
        'top': x,
        'left': y
    })
    $('#container').append(fin);
    if (numNodo != 1) {
        var targetColor = "#316b31";
        var EndpointFin = {
            parent: $("#" + id),
            anchor: "Continuous",
            connectorStyle: {
                strokeStyle: targetColor,
                lineWidth: 2
            },
            connector: ["StateMachine", {
                curviness: 20
            }],
            maxConnections: 2,
            reattach: true
        };
        var fins = $('<div>').attr('id', 'fins' + numNodo).addClass('whites');
        fin.append(fins);
        jsPlumb.makeSource(fins, EndpointFin);
    }
    jsPlumb.draggable(fin);
    jsPlumb.makeTarget(fin, {
        anchor: "Continuous"
    });
}

function makeNodoBreak(x, y, id, texto, numNodo) {
    var Break = $('<div>').attr('id', id).addClass('break').text(texto);
    var breaks = $('<div>').attr('id', 'breaks' + numNodo).addClass('whites');
    ids[ids.length] = id;
    Break.append(breaks);
    Break.css({
        'top': x,
        'left': y
    });
    $('#container').append(Break);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(Break);
    jsPlumb.makeSource(breaks, Endpoint);
    jsPlumb.makeTarget(Break, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    Break.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections(Break);
        document.getElementById(id).remove();
    });
    
}

function makeNodoLectura(x, y, id, texto, numNodo, extra) {
    var lectura = $('<div>').attr('id', id).addClass('lectura').text(texto);
    var lecturas = $('<div>').attr('id', 'lecturas' + numNodo).addClass('whites');
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    lectura.append(input);
    lectura.append(lecturas);
    lectura.css({
        'top': x,
        'left': y
    });
    $('#container').append(lectura);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(lectura);
    jsPlumb.makeSource(lecturas, Endpoint);
    jsPlumb.makeTarget(lectura, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    lectura.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections(lectura);
        document.getElementById(id).remove();
    });
    
}

function makeNodoSiNo(x, y, id, texto, numNodo) {
    var sino = $('<div>').attr('id', id).addClass('si').text(texto);
    var sinos = $('<div>').attr('id', 'sinos' + numNodo).addClass('reds');
    ids[ids.length] = id;
    sino.append(sinos);
    sino.css({
        'top': x,
        'left': y
    });
    $('#container').append(sino);
    var targetColor = "#316b31";
    var Endpoint2 = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(sino);
    jsPlumb.makeSource(sinos, Endpoint2);
    jsPlumb.makeTarget(sino, {
        anchor: "Continuous"
    });
}

function makeNodoSi(x, y, id, texto, numNodo, extra) {
    var si = $('<div>').attr('id', id).addClass('si').text(texto);
    var siop = $('<div>').attr('id', 'sis' + numNodo).addClass('greens');
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    si.append(input);
    si.append(siop);
    si.css({
        'top': x,
        'left': y
    });
    $('#container').append(si);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(si);
    jsPlumb.makeSource(siop, Endpoint);
    jsPlumb.makeTarget(si, {
        anchor: "Continuous"
    });
    
    
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    si.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections($('#fin' + numNodo));
        document.getElementById('fin' + numNodo).remove();
        jsPlumb.detachAllConnections(si);
        document.getElementById(id).remove();
        if ($('#sino' + numNodo).length > 0) {
            jsPlumb.detachAllConnections($('#sino' + numNodo));
            document.getElementById('sino' + numNodo).remove();
        }
    });
    
    
}

function makeNodoFuncion(x, y, id, texto, numNodo, extra) {
    var funcion = $('<div>').attr('id', id).addClass('funcion').text(texto);
    var funcions = $('<div>').attr('id', 'funcions' + numNodo).addClass('darkred');
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    funcion.append(input);
    funcion.append(funcions);
    funcion.css({
        'top': x,
        'left': y
    });
    $('#container').append(funcion);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(funcion);
    jsPlumb.makeSource(funcions, Endpoint);
    jsPlumb.makeTarget(funcion, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    funcion.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections(funcion);
        document.getElementById(id).remove();
    });
    
}
function makeNodoEscritura(x, y, id, texto, numNodo, extra) {
    var escritura = $('<div>').attr('id', id).addClass('escritura').text(texto);
    var escrituras = $('<div>').attr('id', 'escrituras' + numNodo).addClass('whites');
    
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    escritura.append(input);
    escritura.append(escrituras);
    
    escritura.css({
        'top': x,
        'left': y
    });
    $('#container').append(escritura);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(escritura);
    jsPlumb.makeSource(escrituras, Endpoint);
    jsPlumb.makeTarget(escritura, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    escritura.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections(escritura);
        document.getElementById(id).remove();
    });
    
}
function makeNodoAsignacion(x, y, id, texto, numNodo, extra) {
    var asignacion = $('<div>').attr('id', id).addClass('asignacion').text(texto);
    var asignacions = $('<div>').attr('id', 'asignacions' + numNodo).addClass('browns');
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    asignacion.append(input);
    asignacion.append(asignacions);
    asignacion.css({
        'top': x,
        'left': y
    });
    $('#container').append(asignacion);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(asignacion);
    jsPlumb.makeSource(asignacions, Endpoint);
    jsPlumb.makeTarget(asignacion, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    asignacion.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections(asignacion);
        document.getElementById(id).remove();
    });
    
}
function makeNodoMientras(x, y, id, texto, numNodo, extra) {
    var mientras = $('<div>').attr('id', id).addClass('mientras').text(texto);
    var mientrass = $('<div>').attr('id', 'inicios' + numNodo).addClass('darkred');
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    mientras.append(input);
    mientras.append(mientrass);
    mientras.css({
        'top': x,
        'left': y
    });
    $('#container').append(mientras);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(mientras);
    jsPlumb.makeSource(mientrass, Endpoint);
    jsPlumb.makeTarget(mientras, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    mientras.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections($('#fin' + numNodo));
        document.getElementById('fin' + numNodo).remove();
        jsPlumb.detachAllConnections(mientras);
        document.getElementById(id).remove();
    });
    
}
function makeNodoPara(x, y, id, texto, numNodo, extra) {
    var para = $('<div>').attr('id', id).addClass('para').text(texto);
    var paras = $('<div>').attr('id', 'paras' + numNodo).addClass('whites');
    ids[ids.length] = id;
    var input = $('<input>').attr('id', 'text' + numNodo).attr('type', 'text').attr('class', 'texto');
    input.val(extra);
    para.append(input);
    para.append(paras);
    para.css({
        'top': x,
        'left': y
    });
    $('#container').append(para);
    var targetColor = "#316b31";
    var Endpoint = {
        parent: $("#" + id),
        anchor: "Continuous",
        connectorStyle: {
            strokeStyle: targetColor,
            lineWidth: 2
        },
        connector: ["StateMachine", {
            curviness: 20
        }],
        maxConnections: 1,
        reattach: true
    };
    jsPlumb.draggable(para);
    jsPlumb.makeSource(paras, Endpoint);
    jsPlumb.makeTarget(para, {
        anchor: "Continuous"
    });
    
    var borrar = $('<button>').attr('id', 'borrar'+numNodo).addClass('borrar');
    para.append(borrar);
    borrar.click(function() {
        jsPlumb.detachAllConnections($('#fin' + numNodo));
        document.getElementById('fin' + numNodo).remove();
        jsPlumb.detachAllConnections(para);
        document.getElementById(id).remove();
    });
    
}

function conectar(source, target) {
    jsPlumb.connect({
        source: source,
        target: target,
        reattach: true
    });
}