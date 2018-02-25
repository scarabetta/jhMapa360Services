package ar.gob.gcba.dgisis.goarq.cucumber.stepdefs;

import ar.gob.gcba.dgisis.goarq.JhMapa360ServicesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhMapa360ServicesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
