/**
 * Project: rest_project_client
 * File: Command.java
 * Date: Jul 24, 2017
 * Time: 4:08:35 PM
 */

package rest_project.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Yashar Rahvar
 *
 */
public interface Command {

	public void execute(HttpServletRequest request) throws Exception;
}
