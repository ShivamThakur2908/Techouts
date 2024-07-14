package assessment;

import java.util.HashSet;
import java.util.Set;

public class Trainee {
    private Long id;
    private String name;
    private Set<TraineeStudyMaterial> traineeStudyMaterials = new HashSet<>();

    public Trainee(Long id, String name) {
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

    // Methods to manage study materials
    public void addStudyMaterial(StudyMaterial studyMaterial) {
        TraineeStudyMaterial traineeStudyMaterial = new TraineeStudyMaterial(this, studyMaterial);
        traineeStudyMaterials.add(traineeStudyMaterial);
        studyMaterial.getTraineeStudyMaterials().add(traineeStudyMaterial);
    }
}
