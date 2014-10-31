package com.emergya.smartcity.routing;

import org.gofleet.openLS.handlers.RoutingHandler;
import org.jvnet.ogc.DetermineRouteRequestType;
import org.jvnet.ogc.DetermineRouteResponseType;
import org.springframework.stereotype.Service;

@Service
public class RoutingHandlerDispatcher implements RoutingHandler{

	@Override
	public DetermineRouteResponseType routePlan(DetermineRouteRequestType param, int maxResponses) {
		DetermineRouteResponseType response = new DetermineRouteResponseType();
		
		return response;
	}

}
