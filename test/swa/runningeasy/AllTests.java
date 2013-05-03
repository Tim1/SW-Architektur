package swa.runningeasy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import swa.runningeasy.junit.Application;
import swa.runningeasy.junit.Duration;
import swa.runningeasy.junit.Initialize;
import swa.runningeasy.junit.Organization;
import swa.runningeasy.junit.Resultlist;
import swa.runningeasy.junit.Runner;
import swa.runningeasy.junit.RunningEvent;

@RunWith(Suite.class)
@Suite.SuiteClasses({ Initialize.class, Resultlist.class, RunningEvent.class, Organization.class, Runner.class,
		Application.class, Duration.class })
public class AllTests {
}