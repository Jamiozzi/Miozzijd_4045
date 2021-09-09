package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** Handle the /start endpoint
 * @author Administrator
 *
 */
@Controller
public class PlantPlacesController {

		
	@RequestMapping("/start")
		public String start() {
			
			return "start";
		}
	
/** Handle the / endpoint
 * @author Administrator
 *
 */
public String index() {
	
	return "start";
}
}
