/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fanitysfootball;

/**
 *
 * @author mflaschberger
 */
public class Team {
private String name;
private double recordperseason;
private String defense;
private String offence;
private String specialteam;
private double peniltyspergame;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getRecordperseason() {
        return recordperseason;
    }

    public final void setRecordperseason(double recordperseason) {
        this.recordperseason = recordperseason;
    }

    public final String getDefense() {
        return defense;
    }

    public final void  setDefense(String defense) {
        this.defense = defense;
    }

    public final String getOffence() {
        return offence;
    }

    public final void setOffence(String offence) {
        this.offence = offence;
    }

    public final String getSpecialteam() {
        return specialteam;
    }

    public final void setSpecialteam(String specialteam) {
        this.specialteam = specialteam;
    }

    public final double getPeniltyspergame() {
        return peniltyspergame;
    }

    public final void setPeniltyspergame(double peniltyspergame) {
        this.peniltyspergame = peniltyspergame;
    }

}
