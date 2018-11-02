/*
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.validation



import org.xtext.example.mydsl.validation.AbstractTURNValidator

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */

import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.tURN.AndFork
import org.xtext.example.mydsl.tURN.UCMmap
import org.xtext.example.mydsl.tURN.URNspec
import org.xtext.example.mydsl.tURN.TURNPackage
import org.xtext.example.mydsl.tURN.Concern
import org.xtext.example.mydsl.tURN.Actor
import org.xtext.example.mydsl.tURN.IntentionalElement
import org.xtext.example.mydsl.tURN.Contribution
import org.xtext.example.mydsl.tURN.Decomposition
import org.xtext.example.mydsl.tURN.Dependency
import org.xtext.example.mydsl.tURN.StrategiesGroup
import org.xtext.example.mydsl.tURN.EvaluationStrategy
import org.xtext.example.mydsl.tURN.ContributionContextGroup
import org.xtext.example.mydsl.tURN.ContributionContext
import org.xtext.example.mydsl.tURN.LinearConversion
import org.xtext.example.mydsl.tURN.QualToQMappings
import org.xtext.example.mydsl.tURN.PathBodyNodes
import org.xtext.example.mydsl.tURN.Path
import org.xtext.example.mydsl.tURN.OrFork
import org.xtext.example.mydsl.tURN.Stub

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TURNValidator extends AbstractTURNValidator {
	
	 @Check
	def checkAndForkHasAtleastTwoPaths(AndFork andFork) {
		if(andFork.pathbody.size < 2) {
			error("And Fork must have at least two path bodies",TURNPackage.Literals.AND_FORK__PATHBODY)
		}
	}
	
	@Check
	def checkMapHasUniqueName(UCMmap obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (UCMmap map : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
			//for now checking only for name 
				if(!map.name.empty && map.name == obj.name && map != obj )	
					error("Map name must be unique",TURNPackage.Literals.UC_MMAP__NAME)
				if(!map.longName.longname.empty && map.longName.longname.equals(obj.longName.longname) && map != obj )	
					error("Map longname must be unique",TURNPackage.Literals.UC_MMAP__LONG_NAME);
		}
	}
	
	@Check
	def checkConcernHasUniqueName(Concern obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (Concern concern : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!concern.name.empty && concern.name == obj.name && concern != obj )	
					error("Concern name must be unique",TURNPackage.Literals.CONCERN__NAME)
				if(!concern.longName.longname.empty && concern.longName.longname.equals(obj.longName.longname) && concern != obj )	
					error("Concern longname must be unique",TURNPackage.Literals.CONCERN__LONG_NAME);
		}
	}
	
	@Check
	def checkActorHasUniqueName(Actor obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (Actor actor : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!actor.name.empty && actor.name == obj.name && actor != obj )	
					error("Actor name must be unique",TURNPackage.Literals.ACTOR__NAME)
				if(!actor.longName.longname.empty && actor.longName.longname.equals(obj.longName.longname) && actor != obj )	
					error("Actor longname must be unique",TURNPackage.Literals.ACTOR__LONG_NAME);
		}
	}
	
	@Check
	def checkIntElementHasUniqueName(IntentionalElement obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (IntentionalElement intElem : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!intElem.name.empty && intElem.name == obj.name && intElem != obj )	
					error("IntentionalElement name must be unique",TURNPackage.Literals.INTENTIONAL_ELEMENT__NAME)
				if(!intElem.longName.longname.empty && intElem.longName.longname.equals(obj.longName.longname) && intElem != obj )	
					error("IntentionalElement longname must be unique",TURNPackage.Literals.INTENTIONAL_ELEMENT__LONG_NAME);
		}
	}
	
	@Check
	def checkContributionHasUniqueName(Contribution obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (Contribution cont : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!cont.name.empty && cont.name == obj.name && cont != obj )	
					error("Contribution name must be unique",TURNPackage.Literals.CONTRIBUTION__NAME);
				if(!cont.longName.longname.empty && cont.longName.longname.equals(obj.longName.longname) && cont != obj )	
					error("Contribution longname must be unique",TURNPackage.Literals.CONTRIBUTION__LONG_NAME);
		}
	}
	
	@Check
	def checkDecompositionHasUniqueName(Decomposition obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (Decomposition decomp : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!decomp.name.empty && decomp.name == obj.name && decomp != obj )	
					error("Decomposition name must be unique",TURNPackage.Literals.DECOMPOSITION__NAME)
				if(!decomp.longName.longname.empty && decomp.longName.longname.equals(obj.longName.longname) && decomp != obj )	
					error("Decomposition longname must be unique",TURNPackage.Literals.DECOMPOSITION__LONG_NAME);
		}
	}
	
	@Check
	def checkDependencyHasUniqueName(Dependency obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (Dependency dep : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!dep.name.empty && dep.name == obj.name && dep != obj )	
					error("Dependency name must be unique",TURNPackage.Literals.DEPENDENCY__NAME)
				if(!dep.longName.longname.empty && dep.longName.longname.equals(obj.longName.longname) && dep != obj )	
					error("Dependency longname must be unique",TURNPackage.Literals.DEPENDENCY__LONG_NAME);
		}
	}
	
	@Check
	def checkStrategiesGroupHasUniqueName(StrategiesGroup obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (StrategiesGroup sg : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!sg.name.empty && sg.name == obj.name && sg != obj )	
					error("StrategiesGroup name must be unique",TURNPackage.Literals.STRATEGIES_GROUP__NAME)
				if(!sg.longName.longname.empty && sg.longName.longname.equals(obj.longName.longname) && sg != obj )	
					error("StrategiesGroup longname must be unique",TURNPackage.Literals.STRATEGIES_GROUP__LONG_NAME);
		}
	}
	
	@Check
	def checkStrategyHasUniqueName(EvaluationStrategy obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (EvaluationStrategy sg : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!sg.name.empty && sg.name == obj.name && sg != obj )	
					error("EvaluationStrategy name must be unique",TURNPackage.Literals.EVALUATION_STRATEGY__NAME)
				if(!sg.longName.longname.empty && sg.longName.longname.equals(obj.longName.longname) && sg != obj )	
					error("EvaluationStrategy longname must be unique",TURNPackage.Literals.EVALUATION_STRATEGY__LONG_NAME)
		}
	}
	
	@Check
	def checkContribContextGroupHasUniqueName(ContributionContextGroup obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (ContributionContextGroup sg : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!sg.name.empty && sg.name == obj.name && sg != obj )	
					error("ContributionContextGroup name must be unique",TURNPackage.Literals.CONTRIBUTION_CONTEXT_GROUP__NAME)
				if(!sg.longName.longname.empty && sg.longName.longname.equals(obj.longName.longname) && sg != obj )	
					error("ContributionContextGroup longname must be unique",TURNPackage.Literals.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME);
		}
	}
	
	@Check
	def checkContribContextHasUniqueName(ContributionContext obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (ContributionContext cc : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!cc.name.empty && cc.name == obj.name && cc != obj )	
					error("ContributionContextGroup name must be unique",TURNPackage.Literals.CONTRIBUTION_CONTEXT__NAME)
				if(!cc.longName.longname.empty && cc.longName.longname.equals(obj.longName.longname) && cc != obj )	
					error("ContributionContextGroup longname must be unique",TURNPackage.Literals.CONTRIBUTION_CONTEXT__LONG_NAME);
		}
	}
	
	@Check
	def checkLinearConversionHasUniqueName(LinearConversion obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (LinearConversion lc : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!lc.name.empty && lc.name == obj.name && lc != obj )	
					error("LinearConversion name must be unique",TURNPackage.Literals.LINEAR_CONVERSION__NAME)
				if(!lc.longName.longname.empty && lc.longName.longname.equals(obj.longName.longname) && lc != obj )	
					error("LinearConversion longname must be unique",TURNPackage.Literals.LINEAR_CONVERSION__LONG_NAME);
		}
	}
	
	@Check
	def checkQualToQMappingsHasUniqueName(QualToQMappings obj) {
		val spec=EcoreUtil2.getContainerOfType(obj,URNspec)
		for (QualToQMappings mc : EcoreUtil2.getAllContentsOfType(spec, obj.getClass())) {
				if(!mc.name.empty && mc.name == obj.name && mc != obj )	
					error("QualToQMappings name must be unique",TURNPackage.Literals.QUAL_TO_QMAPPINGS__NAME)
				if(!mc.longName.longname.empty && mc.longName.longname.equals(obj.longName.longname) && mc != obj )	
					error("QualToQMappings longname must be unique",TURNPackage.Literals.QUAL_TO_QMAPPINGS__LONG_NAME);
		}
	}
	
	@Check
	def testOrder(PathBodyNodes mc) {
		if(mc.referencedStub !== null && mc.pathEnd !== null)
			error("wrong order of reference",TURNPackage.Literals.PATH_BODY__REFERENCED_STUB);
		if(mc.referencedEnd !== null && mc.pathEnd !== null)
			error("wrong order of reference",TURNPackage.Literals.PATH_BODY__REFERENCED_END);
		
	}
	
	@Check
	def testOrder2(PathBodyNodes mc) {
		val of=EcoreUtil2.getContainerOfType(mc,OrFork)
		val af=EcoreUtil2.getContainerOfType(mc,AndFork)
		val stub=EcoreUtil2.getContainerOfType(mc,Stub)
		if(mc.referencedStub === null && mc.pathEnd === null && mc.pathNodes.size == 0 && mc.referencedEnd === null){
			if(of === null && af === null && stub === null){
				error("wrong order of reference",TURNPackage.Literals.PATH_BODY_NODES__PATH_NODES);}
		}
	}
		
}
