package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 1, max = 50, message = "Location must be between 1 and 50 characters")
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters") String name, @NotBlank @Size(min = 1, max = 50, message = "Location must be between 1 and 50 characters") String location)
    {
        this.setName(name);
        this.location = location;
    }

    public Employer(){}

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}
