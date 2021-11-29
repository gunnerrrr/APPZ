package patterns.APPZ.abstract_factory.umlClass;

import patterns.APPZ.abstract_factory.Relation;

public class UmlClassRelation implements Relation {
    private Integer relationId;
    private String type;
    private String name;
    private Integer firstComponentId;
    private Integer secondComponentId;

    @Override
    public boolean checkRelation() {
        if(!type.equals("Association")
                && !type.equals("Aggregation")
                && !type.equals("Composition")
                && !type.equals("Inheritance")
                && !type.equals("Realization")) {
            return false;
        }
        return true;
    }
}
