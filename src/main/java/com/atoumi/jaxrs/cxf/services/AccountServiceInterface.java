package com.atoumi.jaxrs.cxf.services;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.atoumi.jaxrs.cxf.vo.Account;

/**
 * ahmed.ettoumi@gmail.com <br />
 * 26 mars 2016
 *
 */
@Path("/accountservice/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AccountServiceInterface {
	@GET
	@Path("/accounts/{id}/")
	public Account getAccount(@PathParam("id") final String id);

	@GET
	@Path("/accounts/getall")
	public Collection<Account> getAllAccounts();
}
