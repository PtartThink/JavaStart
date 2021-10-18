package h1017;

public abstract class GuaiWu {
    private String name;
    private int xueliang;
    private int atk;
    private int def;

    public abstract void attack();

    public abstract void remove();

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getXueliang() {
        return xueliang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setXueliang(int xueliang) {
        this.xueliang = xueliang;
    }
}
