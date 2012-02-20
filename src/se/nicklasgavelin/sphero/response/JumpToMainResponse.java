package se.nicklasgavelin.sphero.response;

import se.nicklasgavelin.sphero.command.DeviceCommand.DEVICE_COMMAND;

/**
 * The response for the JumpToMainCommand.
 *
 * @author Nicklas Gavelin, nicklas.gavelin@gmail.com, Luleå University of Technology
 */
public class JumpToMainResponse extends DeviceResponse
{
    /**
     * Create the JumpToMainResponse from the received data
     *
     * @param data The received data
     */
    public JumpToMainResponse( byte[] data )
    {
        super( DEVICE_COMMAND.JUMP_TO_MAIN, data );
    }
}