package patterns.APPZ.bridge;

import patterns.APPZ.abstract_factory.Component;
import patterns.APPZ.abstract_factory.Relation;
import patterns.APPZ.abstract_factory.umlClass.UmlClassDiagramFactory;
import patterns.APPZ.abstract_factory.umlUseCase.UmlUseCaseDiagramFactory;
import patterns.APPZ.entities.Task;

import java.util.List;

public class TaskController {
    private TaskService taskService;
    public void Post (Task task) {
        //here will be logic for parsing components and relations from file
        if(task.getTypeOfDiagram().equals("Use Case")) {
            UmlUseCaseDiagramFactory umlUseCaseDiagramFactory = new UmlUseCaseDiagramFactory();
            List<Component> componentList=umlUseCaseDiagramFactory.createComponents(5,task.getContent()); //num will be from file
            List<Relation> relationList=umlUseCaseDiagramFactory.createRelations(20,task.getContent()); //num will be from file

            StringBuilder diagram= new StringBuilder();
            diagram.append("\n Components: \n");
            componentList.forEach(diagram::append);

            diagram.append("\n Relations: \n");
            relationList.forEach(diagram::append);

            task.setParsedDiagram(diagram.toString());
        }
        else if(task.getTypeOfDiagram().equals("Class")) {
            UmlClassDiagramFactory umlClassDiagramFactory = new UmlClassDiagramFactory();
            List<Component> componentList=umlClassDiagramFactory.createComponents(5,task.getContent()); //num will be from file
            List<Relation> relationList=umlClassDiagramFactory.createRelations(20,task.getContent()); //num will be from file

            StringBuilder diagram= new StringBuilder();
            diagram.append("\n Components: \n");
            componentList.forEach(diagram::append);

            diagram.append("\n Relations: \n");
            relationList.forEach(diagram::append);

            task.setParsedDiagram(diagram.toString());
        }
        taskService.CreateTask(task);
    }
    public void Get (Integer taskId) {
        taskService.getTaskById(taskId);
    }
    public void Put (Integer taskId, Task newInfo) {
        taskService.UpdateTask(taskId,newInfo);
    }
    public void Delete (Integer taskId) {
        taskService.DeleteTask(taskId);
    }
}
