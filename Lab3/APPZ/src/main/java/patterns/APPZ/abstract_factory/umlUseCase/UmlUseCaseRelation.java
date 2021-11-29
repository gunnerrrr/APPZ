package patterns.APPZ.abstract_factory.umlUseCase;

import patterns.APPZ.abstract_factory.Relation;

public class UmlUseCaseRelation implements Relation {
    private Integer relationId;
    private String type;
    private String name;
    private Integer firstComponentId;
    private Integer secondComponentId;

    @Override
    public boolean checkRelation() {
        if(!type.equals("Association")) {
            return false;
        }
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstComponentId() {
        return firstComponentId;
    }

    public void setFirstComponentId(Integer firstComponentId) {
        this.firstComponentId = firstComponentId;
    }

    public Integer getSecondComponentId() {
        return secondComponentId;
    }

    public void setSecondComponentId(Integer secondComponentId) {
        this.secondComponentId = secondComponentId;
    }
}
