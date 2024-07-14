package assessment;

import java.util.HashSet;
import java.util.Set;

public class StudyMaterial {
    private Long id;
    private String name;
    private Set<TraineeStudyMaterial> traineeStudyMaterials = new HashSet<>();
    
    public StudyMaterial(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TraineeStudyMaterial> getTraineeStudyMaterials() {
        return traineeStudyMaterials;
    }

    public void setTraineeStudyMaterials(Set<TraineeStudyMaterial> traineeStudyMaterials) {
        this.traineeStudyMaterials = traineeStudyMaterials;
    }
}
