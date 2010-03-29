package org.jbehave.core;

import org.jbehave.core.model.KeyWords;
import org.jbehave.core.errors.ErrorStrategy;
import org.jbehave.core.errors.PendingErrorStrategy;
import org.jbehave.core.parser.StoryDefiner;
import org.jbehave.core.reporters.StoryReporter;
import org.jbehave.core.reporters.StepdocReporter;
import org.jbehave.core.steps.StepCreator;
import org.jbehave.core.steps.StepdocGenerator;

/**
 * Provides the configuration used by the {@link StoryRunner} and is injected
 * in the {@link JUnitStory} to customise its runtime properties.
 * 
 * The configuration may change dynamically, so any other class wishing to use this
 * should store the whole configuration, and use the respective parts of it at
 * runtime, rather than attempting to store any part of it when the
 * configuration is provided.
 * 
 * @author Elizabeth Keogh
 * @author Mauro Talevi
 */
public interface Configuration {

	StoryDefiner forDefiningStories();

	StoryReporter forReportingStories();

	PendingErrorStrategy forPendingSteps();

	StepCreator forCreatingSteps();

	ErrorStrategy forHandlingErrors();

	KeyWords keywords();

	StepdocGenerator forGeneratingStepdoc();

	StepdocReporter forReportingStepdoc();

}