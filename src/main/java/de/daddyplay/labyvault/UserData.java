package de.daddyplay.labyvault;

public class UserData {
    private int money = 0;
    private String[] jobs = null;
    private String[] level = null;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String[] getJobs() {
        if (jobs == null) {
            String[] strings = new String[1];
            strings[0] = "Job";
            return strings;
        }
        return jobs;
    }

    public void setJobs(String[] jobs) {
        this.jobs = jobs;
    }

    public String[] getLevel() {
        if (level == null) {
            String[] strings = new String[1];
            strings[0] = "Level";
            return strings;
        }
        return level;
    }

    public void setLevel(String[] level) {
        this.level = level;
    }
}
