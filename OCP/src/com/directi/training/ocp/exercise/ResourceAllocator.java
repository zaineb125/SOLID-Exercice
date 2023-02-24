package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    
    public int allocate(Ressource ressource)
    {
        int resourceId;
        resourceId = ressource.findSlot();
        ressource.markBusy(resourceId);
        return resourceId;
    }

    public void free(Ressource ressource, int resourceId)
    {
        ressource.markFree(resourceId);
    }
}
