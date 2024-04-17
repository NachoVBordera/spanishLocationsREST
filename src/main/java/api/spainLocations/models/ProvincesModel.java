package api.spainLocations.models;

import jakarta.persistence.*;

@Entity
@Table(name= "Provinces")
public class ProvincesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getCcaaCode() {
        return ccaaCode;
    }

    public void setCcaaCode(short ccaaCode) {
        this.ccaaCode = ccaaCode;
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

    private short ccaaCode;
    private String label;
    private short code;

}
