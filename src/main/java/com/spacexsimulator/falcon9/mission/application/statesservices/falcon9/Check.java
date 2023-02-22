package com.spacexsimulator.falcon9.mission.application.statesservices.falcon9;

import com.spacexsimulator.falcon9.mission.application.statesmachine.MissionEvents;
import com.spacexsimulator.falcon9.mission.application.statesmachine.MissionStates;
import com.spacexsimulator.falcon9.mission.domain.Falcon9ActualStats;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import reactor.core.publisher.Mono;

public class Check implements Action<MissionStates, MissionEvents> {

    Logger logger = LoggerFactory.getLogger(Check.class);

    @Override
    public void execute(StateContext<MissionStates, MissionEvents> context) {
        logger.info("** Falcon 9 ** Checking");

        Message<MissionEvents> event = MessageBuilder.withPayload(MissionEvents.SUCCESS).build();
        context.getStateMachine().sendEvent(Mono.just(event)).subscribe();
    }
}
