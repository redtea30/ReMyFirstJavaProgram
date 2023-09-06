package genshinImpactStart;

/**
 * ClassName:Role
 * Package: genshinImpactStart
 * Description:
 *
 * @Author Neko
 * @Create 6/9/20233:13 pm
 * @Version 1.0
 */
public class Role {
    private String name;
    private char property;
    private int rarity;
    private int star;
    private int level;

    public Role() {
    }

    public Role(String name, char property, int rarity, int star, int level) {
        this.name = name;
        this.property = property;
        this.rarity = rarity;
        this.star = star;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getProperty() {
        return property;
    }

    public void setProperty(char property) {
        this.property = property;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", property=" + property +
                ", rarity=" + rarity +
                ", star=" + star +
                ", level=" + level +
                '}';
    }
}
