package service;

import model.Event;
import model.ProgramPoint;

import java.util.List;

public interface ProgramPointService {

    List<ProgramPoint> getAllProgramPoints();
    List<ProgramPoint> getProgramPointsOfUser(String login);
    List<ProgramPoint> getProgramPointsFromEvent(String eventTitle);
    List<ProgramPoint> getProgramPointsOfType(String type);
    boolean saveProgramPoint(ProgramPoint newProgramPoint);
    boolean deleteProgramPoint(Long id);



}
