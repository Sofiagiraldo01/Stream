package map;

public class Taxista {
    private int id;
    private String name;
    private Double carrera;
    private String empresa;

    public Taxista(int id, String name, Double salary, String empresa) {
        this.id = id;
        this.name = name;
        this.carrera = carrera;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCarrera() {
        return carrera;
    }

    public void setCarrera(Double carrera) {
        this.carrera = carrera;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}