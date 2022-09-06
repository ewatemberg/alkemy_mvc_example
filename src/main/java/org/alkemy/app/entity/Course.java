package org.alkemy.app.entity;

/**
 * Esta clase representa la entidad de un curso
 */
public class Course {

    private String id;
    private String name;
    private Integer maximumCapacity;

    public Course() {
    }

    public Course(String id, String name, Integer maximumCapacity) {
        this.id = id;
        this.name = name;
        this.maximumCapacity = maximumCapacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(Integer maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
}
