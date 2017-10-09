package healthypets;

public enum Food {
    KATT("kattfoder"),
    HUND("hundfoder"),
    ORM("ormpellets");
    
    public final String foder;
    
    private Food(String foder){
        this.foder = foder;
    }
}
