/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */
import { Container, ContainerModule } from "inversify";
import {
    ConsoleLogger, ExpandButtonHandler, ExpandButtonView, HtmlRoot,
    HtmlRootView, LogLevel, PreRenderedElement,
    PreRenderedView, SCompartment, SCompartmentView, SEdge, SGraph,
    SGraphView, SLabel, SLabelView, TYPES, boundsModule,
    buttonModule, configureModelElement, defaultModule, expandModule,
    exportModule, fadeModule, hoverModule, modelSourceModule, moveModule,
    openModule, overrideViewerOptions, selectModule, undoRedoModule,
    viewportModule, SButton, PolylineEdgeView
} from 'sprotty/lib';
import { popupModelFactory } from "./popup";
import {
    ArrowEdgeView, ResourceNodeView, GoalNodeView, SoftgoalNodeView, BeliefNodeView, TaskNodeView, IndicatorNodeView,
    CompositionEdgeView, DashedArrowEdgeView, DashedEdgeView, HeaderCompartmentView, ModuleNodeView, SoftgoalNodeViewTry,
    ContributeEdgeView, NoteView, TagView, CorrelationEdgeView, DecompositionEdgeView, ModuleNodeView2, ClassNodeView2, DependencyEdgeView
} from "./views";
import { Tag, TURNLabel, TURNNode, MAPStartNode } from "./turn-models";
import { TURNModelFactory } from "./model-factory";

const turnDiagramModule = new ContainerModule((bind, unbind, isBound, rebind) => {
    rebind(TYPES.ILogger).to(ConsoleLogger).inSingletonScope()
    rebind(TYPES.LogLevel).toConstantValue(LogLevel.warn)
    rebind(TYPES.IModelFactory).to(TURNModelFactory).inSingletonScope()
    bind(TYPES.PopupModelFactory).toConstantValue(popupModelFactory)
    const context = { bind, unbind, isBound, rebind };
    configureModelElement(context, 'graph', SGraph, SGraphView);
    configureModelElement(context, 'node:goal', TURNNode, GoalNodeView)
    configureModelElement(context, 'node:softgoal', TURNNode, SoftgoalNodeView)
    configureModelElement(context, 'node:softgoaltry', TURNNode, SoftgoalNodeViewTry)
    configureModelElement(context, 'node:belief', TURNNode, BeliefNodeView)
    configureModelElement(context, 'node:actor', TURNNode, ModuleNodeView)
    configureModelElement(context, 'node:task', TURNNode, TaskNodeView)
    configureModelElement(context, 'node:indicator', TURNNode, IndicatorNodeView)
    configureModelElement(context, 'node:resource', TURNNode, ResourceNodeView)
    configureModelElement(context, 'node:path', MAPStartNode, ModuleNodeView2)
    configureModelElement(context, 'node:end', TURNNode, ClassNodeView2)
    configureModelElement(context, 'node:note', TURNNode, NoteView)
    configureModelElement(context, 'label:heading', SLabel, SLabelView)
    configureModelElement(context, 'label:text', SLabel, SLabelView)
    configureModelElement(context, 'ylabel:text', TURNLabel, SLabelView)
    configureModelElement(context, 'label:classHeader', SLabel, SLabelView)
    configureModelElement(context, 'tag', Tag, TagView)
    configureModelElement(context, 'label:tag', SLabel, SLabelView)
    configureModelElement(context, 'comp:comp', SCompartment, SCompartmentView)
    configureModelElement(context, 'comp:classHeader', SCompartment, HeaderCompartmentView)
    configureModelElement(context, 'edge:dependency', SEdge, DependencyEdgeView)
    configureModelElement(context, 'edge:straight', SEdge, PolylineEdgeView)
    configureModelElement(context, 'edge:decomposition', SEdge, DecompositionEdgeView)
    configureModelElement(context, 'edge:straight2', SEdge, PolylineEdgeView)
    configureModelElement(context, 'edge:composition', SEdge, CompositionEdgeView)
    configureModelElement(context, 'edge:dashed', SEdge, DashedEdgeView)
    configureModelElement(context, 'edge:contribute', SEdge, ContributeEdgeView)
    configureModelElement(context, 'edge:correlated', SEdge, CorrelationEdgeView)
    configureModelElement(context, 'edge:uses', SEdge, DashedArrowEdgeView)
    configureModelElement(context, 'edge:augments', SEdge, ArrowEdgeView)
    configureModelElement(context, 'html', HtmlRoot, HtmlRootView)
    configureModelElement(context, 'pre-rendered', PreRenderedElement, PreRenderedView)
    configureModelElement(context, ExpandButtonHandler.TYPE, SButton, ExpandButtonView)
})

export default function createContainer(widgetId: string): Container {
    const container = new Container()
    container.load(defaultModule, selectModule, moveModule, boundsModule, undoRedoModule, viewportModule,
        hoverModule, fadeModule, exportModule, expandModule, openModule, buttonModule, modelSourceModule,
        turnDiagramModule)
    //        container.bind(TYPES.ModelSource).to(TheiaDiagramServer).inSingletonScope()
    overrideViewerOptions(container, {
        needsClientLayout: true,
        needsServerLayout: true,
        baseDiv: widgetId
    })
    return container
}