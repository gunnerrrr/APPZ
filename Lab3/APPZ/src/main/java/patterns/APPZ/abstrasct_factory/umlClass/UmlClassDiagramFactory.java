package patterns.APPZ.abstrasct_factory.umlClass;

import patterns.APPZ.abstrasct_factory.Component;
import patterns.APPZ.abstrasct_factory.DiagramFactory;
import patterns.APPZ.abstrasct_factory.Relation;
import patterns.APPZ.abstrasct_factory.umlUseCase.UmlUseCaseComponent;
import patterns.APPZ.abstrasct_factory.umlUseCase.UmlUseCaseRelation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UmlClassDiagramFactory implements DiagramFactory {


    @Override
    public List<Component> createComponents(Integer numOfComponents, File content) {
        List<Component> componentList = new ArrayList<>();
        for(Integer i=0;i<numOfComponents;i++){
            //here will be logic for parsing diagram
            UmlClassComponent component = new UmlClassComponent();
            componentList.add(component);
        }
        return componentList;
    }

    @Override
    public List<Relation> createRelations(Integer numOfRelations, File content) {
        List<Relation> relationList = new ArrayList <> ();
        for(Integer i=0;i<numOfRelations;i++){
            //here will be logic for parsing diagram
            UmlClassRelation relation = new UmlClassRelation();
            relationList.add(relation);
        }
        return relationList;
    }
}
