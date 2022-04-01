import java.util.List;

public class Institute {
    private String name;
    private String address;
    private List<ResearchAssociates> researchAssociates;
    
    public Institute(String name, String address, List<ResearchAssociates> researchAssociates) {
        this.name = name;
        this.address = address;
        this.researchAssociates = researchAssociates;
    }
    public List<ResearchAssociates> getResearchAssociates() {
        return researchAssociates;
    }
    public void setResearchAssociates(List<ResearchAssociates> researchAssociates) {
        this.researchAssociates = researchAssociates;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
