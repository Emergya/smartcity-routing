package com.emergya.smartcity.routing;

import net.opengis.xls.v_1_2_0.DetermineRouteRequestType;
import net.opengis.xls.v_1_2_0.DetermineRouteResponseType;

import org.gofleet.openLS.handlers.RoutingHandler;
import org.springframework.stereotype.Service;

@Service
public class RoutingHandlerImpl implements RoutingHandler{

	@Override
	public DetermineRouteResponseType routePlan(DetermineRouteRequestType param, int maxResponses) {
		return null;
	}

}
