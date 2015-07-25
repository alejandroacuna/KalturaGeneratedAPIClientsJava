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
import com.kaltura.client.enums.KalturaNullableBoolean;
import com.kaltura.client.enums.KalturaLiveReportOrderBy;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 25 Jul 15 00:32:50 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaLiveReportInputFilter extends KalturaObjectBase {
    public String entryIds;
    public int fromTime = Integer.MIN_VALUE;
    public int toTime = Integer.MIN_VALUE;
    public KalturaNullableBoolean live;
    public KalturaLiveReportOrderBy orderBy;

    public KalturaLiveReportInputFilter() {
    }

    public KalturaLiveReportInputFilter(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("entryIds")) {
                this.entryIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("fromTime")) {
                this.fromTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("toTime")) {
                this.toTime = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("live")) {
                this.live = KalturaNullableBoolean.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("orderBy")) {
                this.orderBy = KalturaLiveReportOrderBy.get(ParseUtils.parseString(txt));
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaLiveReportInputFilter");
        kparams.add("entryIds", this.entryIds);
        kparams.add("fromTime", this.fromTime);
        kparams.add("toTime", this.toTime);
        kparams.add("live", this.live);
        kparams.add("orderBy", this.orderBy);
        return kparams;
    }

}

