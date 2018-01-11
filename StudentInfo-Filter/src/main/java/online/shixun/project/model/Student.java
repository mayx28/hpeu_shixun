package online.shixun.project.model;

public class Student {
    private Integer id;

    private Integer stuNum;

    private String stuName;

    private String stuSex;

    private String stuPro;

    private String stuDir;

    private Integer stuSkill;

    private Integer stuAbility;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuPro() {
        return stuPro;
    }

    public void setStuPro(String stuPro) {
        this.stuPro = stuPro == null ? null : stuPro.trim();
    }

    public String getStuDir() {
        return stuDir;
    }

    public void setStuDir(String stuDir) {
        this.stuDir = stuDir == null ? null : stuDir.trim();
    }

    public Integer getStuSkill() {
        return stuSkill;
    }

    public void setStuSkill(Integer stuSkill) {
        this.stuSkill = stuSkill;
    }

    public Integer getStuAbility() {
        return stuAbility;
    }

    public void setStuAbility(Integer stuAbility) {
        this.stuAbility = stuAbility;
    }
}