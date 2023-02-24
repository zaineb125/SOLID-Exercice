package com.directi.training.ocp.exercise;

public interface Ressource {
    public  int findSlot();
    public  void markBusy(int resourceId) ;
    public  void markFree(int resourceId) ;
}
