package com.niftyside.icloud.calendars.app.events;

import java.util.EventObject;

/**
 * Event that gets fired when submitting credentials.
 * 
 * @author Daniel Muehlbachler
 * @copyright 2012 Daniel Muehlbachler
 * 
 * @see {@link http://icloud.niftyside.com}
 * 
 * @version 1.0
 * 
 */
public class CredentialEvent extends EventObject {
	/* * * * * Variables * * * * */

	private static final long serialVersionUID = 3761385660558342113L;
	/** The submitted Apple ID. */
	private final String appleID;
	/** The submitted password. */
	private final String password;
	/** The submitted server. */
	private final String server;

	/* * * * * Constructor * * * * */

	/**
	 * Creates a new event.
	 * 
	 * @param source
	 *            the source object
	 * @param appleID
	 *            the Apple ID
	 * @param password
	 *            the password
	 * @param server
	 *            the server to use
	 * 
	 * @since 1.0
	 */
	public CredentialEvent(Object source, String appleID, String password,
			String server) {
		super(source);

		this.appleID = appleID;
		this.password = password;
		this.server = server;
	}

	/* * * * * Methods * * * * */

	/**
	 * Gets the Apple ID.
	 * 
	 * @return the Apple ID
	 * 
	 * @since 1.0
	 */
	public String getAppleID() {
		return appleID;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 * 
	 * @since 1.0
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Gets the server.
	 * 
	 * @return the server
	 * 
	 * @since 1.0
	 */
	public String getServer() {
		return server;
	}
}
