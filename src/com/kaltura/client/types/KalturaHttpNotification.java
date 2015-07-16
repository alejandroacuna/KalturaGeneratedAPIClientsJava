// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2015  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaEventNotificationEventObjectType;
import com.kaltura.client.enums.KalturaEventNotificationEventType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Thu, 16 Jul 15 14:44:55 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Wrapper for sent notifications     */
@SuppressWarnings("serial")
public class KalturaHttpNotification extends KalturaObjectBase {
	/**  Object that triggered the notification     */
    public KalturaObjectBase object;
	/**  Object type that triggered the notification     */
    public KalturaEventNotificationEventObjectType eventObjectType;
	/**  ID of the batch job that execute the notification     */
    public long eventNotificationJobId = Long.MIN_VALUE;
	/**  ID of the template that triggered the notification     */
    public int templateId = Integer.MIN_VALUE;
	/**  Name of the template that triggered the notification     */
    public String templateName;
	/**  System name of the template that triggered the notification     */
    public String templateSystemName;
	/**  Ecent type that triggered the notification     */
    public KalturaEventNotificationEventType eventType;

    public KalturaHttpNotification() {
    }

    public KalturaHttpNotification(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("object")) {
                this.object = ParseUtils.parseObject(KalturaObjectBase.class, aNode);
                continue;
            } else if (nodeName.equals("eventObjectType")) {
                this.eventObjectType = KalturaEventNotificationEventObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("eventNotificationJobId")) {
                this.eventNotificationJobId = ParseUtils.parseBigint(txt);
                continue;
            } else if (nodeName.equals("templateId")) {
                this.templateId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("templateName")) {
                this.templateName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("templateSystemName")) {
                this.templateSystemName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("eventType")) {
                this.eventType = KalturaEventNotificationEventType.get(ParseUtils.parseString(txt));
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaHttpNotification");
        kparams.add("object", this.object);
        kparams.add("eventObjectType", this.eventObjectType);
        kparams.add("eventNotificationJobId", this.eventNotificationJobId);
        kparams.add("templateId", this.templateId);
        kparams.add("templateName", this.templateName);
        kparams.add("templateSystemName", this.templateSystemName);
        kparams.add("eventType", this.eventType);
        return kparams;
    }

}

