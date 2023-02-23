package com.spacexsimulator.falcon9.landinglegs.domain;

import com.spacexsimulator.falcon9.mission.application.statesservices.falcon9.VerticalLanding;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.POST;



public class LandingLegs {
  private Boolean Leg0;
  private Boolean Leg90;
  private Boolean Leg180;
  private Boolean Leg270;
  private boolean VerticalLanding = true;


  public void Aterrizaje() {


    Boolean Leg0 = true;
    Boolean Leg90= true;
    Boolean Leg180= true;
    Boolean Leg270= true;



  }



  public void Despegue() {


    Boolean Leg0 = false;
    Boolean Leg90= false;
    Boolean Leg180= false;
    Boolean Leg270= false;



  }



}




