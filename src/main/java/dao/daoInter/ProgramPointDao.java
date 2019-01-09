package dao.daoInter;

import model.ProgramPoint;

import java.util.Iterator;

public interface ProgramPointDao {

    Iterator <ProgramPoint>showAllProgramPoints();
    ProgramPoint findProgramPointByTitle();
    boolean saveProgramPoint(ProgramPoint programPoint);
    boolean deleteProgramPoint(Long id);
}
