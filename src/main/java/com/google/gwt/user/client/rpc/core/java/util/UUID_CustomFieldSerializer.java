package com.google.gwt.user.client.rpc.core.java.util;

import java.util.UUID;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

/**
 * @author senk.christian@gmail.com
 *
 */
public class UUID_CustomFieldSerializer {

	public static void deserialize(SerializationStreamReader streamReader, UUID instance) {
		// No fields
	}

	public static UUID instantiate(SerializationStreamReader streamReader) throws SerializationException {
		return UUID.fromString(streamReader.readString());
	}

	public static void serialize(SerializationStreamWriter streamWriter, UUID instance) throws SerializationException {
		streamWriter.writeString(instance.toString());
	}
}
