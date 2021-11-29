package patterns.APPZ.abstract_factory.umlUseCase;

import patterns.APPZ.abstract_factory.DiagramFactory;
import patterns.APPZ.abstract_factory.Component;
import patterns.APPZ.abstract_factory.Relation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UmlUseCaseDiagramFactory implements DiagramFactory {

    @Override
    public List<Component> createComponents(Integer numOfComponents, File content) {
        List<Component> componentList = new ArrayList <> ();
        for(Integer i=0;i<numOfComponents;i++){
            //here will be logic for parsing diagram
            UmlUseCaseComponent component = new UmlUseCaseComponent();
            componentList.add(component);
        }
        return componentList;
    }

    @Override
    public List<Relation> createRelations(Integer numOfRelations, File content) {
        List<Relation> relationList = new ArrayList <> ();
        for(Integer i=0;i<numOfRelations;i++){
            //here will be logic for parsing diagram
            UmlUseCaseRelation relation = new UmlUseCaseRelation();
            relationList.add(relation);
        }
        return relationList;
    }
}
