package api.spainLocations.models;

import jakarta.persistence.*;

@Entity
@Table(name= "cities")
public class CitiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private short parentCode;
    private String label;
    private short code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getParentCode() {
        return parentCode;
    }

    public void setParentCode(short parentCode) {
        this.parentCode = parentCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }
}
