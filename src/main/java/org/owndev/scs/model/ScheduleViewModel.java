package org.owndev.scs.model;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

@Named(value = "scheduleViewModel")
public class ScheduleViewModel implements Serializable{

    private Map<String, String> params;

    private String objectName = "Учитель";

    @PostConstruct
    private void init() {
        params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
    }

    public String getObjectName() {
        return objectName;
    }

    public void setDialogData() {

    }

}
