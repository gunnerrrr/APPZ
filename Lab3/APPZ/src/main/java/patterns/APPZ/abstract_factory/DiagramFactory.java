package patterns.APPZ.abstract_factory;

import java.io.File;
import java.util.List;

public interface DiagramFactory {
    List<Component> createComponents(Integer numOfComponents, File content);
    List<Relation> createRelations(Integer numOfRelations, File content);
}
