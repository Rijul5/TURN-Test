package mcgill.xtext.turn;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.example.mydsl.tURN.Actor;
import org.xtext.example.mydsl.tURN.ComponentRef;
import org.xtext.example.mydsl.tURN.Contribution;
import org.xtext.example.mydsl.tURN.EndPoint;
import org.xtext.example.mydsl.tURN.IntentionalElement;
import org.xtext.example.mydsl.tURN.OrFork;
import org.xtext.example.mydsl.tURN.OrJoin;
import org.xtext.example.mydsl.tURN.RespRef;
import org.xtext.example.mydsl.tURN.StartPoint;
import org.xtext.example.mydsl.tURN.Stub;
import org.xtext.example.mydsl.tURN.Timer;
import org.xtext.example.mydsl.tURN.UCMmap;

public class MyQNP extends DefaultDeclarativeQualifiedNameProvider {
	
	QualifiedName qualifiedName(IntentionalElement intElem) {
		QualifiedName intElemName=QualifiedName.create(EcoreUtil2.getContainerOfType(intElem, Actor.class).getName(), intElem.getName());
		return intElemName;
	}
	
	QualifiedName qualifiedName(Contribution cont) {
		QualifiedName contName=QualifiedName.create(EcoreUtil2.getContainerOfType(cont, Actor.class).getName(), cont.getName());
		return contName;
	}
	
	QualifiedName qualifiedName(Timer timer) {
		QualifiedName timerName=QualifiedName.create(EcoreUtil2.getContainerOfType(timer, UCMmap.class).getName(), timer.getName());
		return timerName;
	}
	
	QualifiedName qualifiedName(EndPoint endPoint) {
		QualifiedName endPtname=QualifiedName.create(EcoreUtil2.getContainerOfType(endPoint, UCMmap.class).getName(), endPoint.getName());
		return endPtname;
	}
	 
	QualifiedName qualifiedName(StartPoint startPoint) {
		QualifiedName startPtName=QualifiedName.create(EcoreUtil2.getContainerOfType(startPoint, UCMmap.class).getName(), startPoint.getName());
		return startPtName;
	}
	 
	QualifiedName qualifiedName(RespRef resp) {
			QualifiedName respName=QualifiedName.create(EcoreUtil2.getContainerOfType(resp, UCMmap.class).getName(), resp.getName());
			return respName;
	}
	
	QualifiedName qualifiedName(OrFork orFork) {
			QualifiedName orForkName=QualifiedName.create(EcoreUtil2.getContainerOfType(orFork, UCMmap.class).getName(), orFork.getName());
			return orForkName;
	}

	QualifiedName qualifiedName(Stub stub) {
		QualifiedName stubName=QualifiedName.create(EcoreUtil2.getContainerOfType(stub, UCMmap.class).getName(), stub.getName());
		return stubName;
	}
	
	QualifiedName qualifiedName(OrJoin orjoin) {
		QualifiedName orJoinName=QualifiedName.create(EcoreUtil2.getContainerOfType(orjoin, UCMmap.class).getName(), orjoin.getName());
		return orJoinName;
	}
	
	QualifiedName qualifiedName(ComponentRef comp) {
		QualifiedName compName=QualifiedName.create(comp.getName());
		return compName;
}
	
}

