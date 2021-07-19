/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.spin.queue.notification.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_NotificationQueue
 *  @author Adempiere (generated) 
 *  @version Release 3.9.3 - $Id$ */
public class X_AD_NotificationQueue extends PO implements I_AD_NotificationQueue, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210602L;

    /** Standard Constructor */
    public X_AD_NotificationQueue (Properties ctx, int AD_NotificationQueue_ID, String trxName)
    {
      super (ctx, AD_NotificationQueue_ID, trxName);
      /** if (AD_NotificationQueue_ID == 0)
        {
			setAD_NotificationQueue_ID (0);
			setAD_Queue_ID (0);
			setApplicationType (null);
        } */
    }

    /** Load Constructor */
    public X_AD_NotificationQueue (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_AD_NotificationQueue[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.spin.model.I_AD_AppRegistration getAD_AppRegistration() throws RuntimeException
    {
		return (org.spin.model.I_AD_AppRegistration)MTable.get(getCtx(), org.spin.model.I_AD_AppRegistration.Table_Name)
			.getPO(getAD_AppRegistration_ID(), get_TrxName());	}

	/** Set Application Registration.
		@param AD_AppRegistration_ID 
		External Application Registration
	  */
	public void setAD_AppRegistration_ID (int AD_AppRegistration_ID)
	{
		if (AD_AppRegistration_ID < 1) 
			set_Value (COLUMNNAME_AD_AppRegistration_ID, null);
		else 
			set_Value (COLUMNNAME_AD_AppRegistration_ID, Integer.valueOf(AD_AppRegistration_ID));
	}

	/** Get Application Registration.
		@return External Application Registration
	  */
	public int getAD_AppRegistration_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_AppRegistration_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.spin.model.I_AD_AppSupport getAD_AppSupport() throws RuntimeException
    {
		return (org.spin.model.I_AD_AppSupport)MTable.get(getCtx(), org.spin.model.I_AD_AppSupport.Table_Name)
			.getPO(getAD_AppSupport_ID(), get_TrxName());	}

	/** Set App Support.
		@param AD_AppSupport_ID 
		App Support for External Connection
	  */
	public void setAD_AppSupport_ID (int AD_AppSupport_ID)
	{
		if (AD_AppSupport_ID < 1) 
			set_Value (COLUMNNAME_AD_AppSupport_ID, null);
		else 
			set_Value (COLUMNNAME_AD_AppSupport_ID, Integer.valueOf(AD_AppSupport_ID));
	}

	/** Get App Support.
		@return App Support for External Connection
	  */
	public int getAD_AppSupport_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_AppSupport_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Notification Queue.
		@param AD_NotificationQueue_ID 
		Notification Queue used for manage all system notification
	  */
	public void setAD_NotificationQueue_ID (int AD_NotificationQueue_ID)
	{
		if (AD_NotificationQueue_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_NotificationQueue_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_NotificationQueue_ID, Integer.valueOf(AD_NotificationQueue_ID));
	}

	/** Get Notification Queue.
		@return Notification Queue used for manage all system notification
	  */
	public int getAD_NotificationQueue_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_NotificationQueue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.spin.queue.model.I_AD_Queue getAD_Queue() throws RuntimeException
    {
		return (org.spin.queue.model.I_AD_Queue)MTable.get(getCtx(), org.spin.queue.model.I_AD_Queue.Table_Name)
			.getPO(getAD_Queue_ID(), get_TrxName());	}

	/** Set System Queue.
		@param AD_Queue_ID System Queue	  */
	public void setAD_Queue_ID (int AD_Queue_ID)
	{
		if (AD_Queue_ID < 1) 
			set_Value (COLUMNNAME_AD_Queue_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Queue_ID, Integer.valueOf(AD_Queue_ID));
	}

	/** Get System Queue.
		@return System Queue	  */
	public int getAD_Queue_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Queue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ApplicationType AD_Reference_ID=54081 */
	public static final int APPLICATIONTYPE_AD_Reference_ID=54081;
	/** Message Queue = MQS */
	public static final String APPLICATIONTYPE_MessageQueue = "MQS";
	/** WebDav Application = WDV */
	public static final String APPLICATIONTYPE_WebDavApplication = "WDV";
	/** Social Media = SMN */
	public static final String APPLICATIONTYPE_SocialMedia = "SMN";
	/** Cache Server Provider = CSP */
	public static final String APPLICATIONTYPE_CacheServerProvider = "CSP";
	/** Set Application Type.
		@param ApplicationType 
		Application Type, used for identify a Application Type like Message Queue
	  */
	public void setApplicationType (String ApplicationType)
	{

		set_Value (COLUMNNAME_ApplicationType, ApplicationType);
	}

	/** Get Application Type.
		@return Application Type, used for identify a Application Type like Message Queue
	  */
	public String getApplicationType () 
	{
		return (String)get_Value(COLUMNNAME_ApplicationType);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getApplicationType()));
    }

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Description.
		@param Text Description	  */
	public void setText (String Text)
	{
		set_Value (COLUMNNAME_Text, Text);
	}

	/** Get Description.
		@return Description	  */
	public String getText () 
	{
		return (String)get_Value(COLUMNNAME_Text);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}