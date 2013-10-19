package org.faur.api.simulator;

/**
 * (C) Copyright 2013 Faur Ioan-Aurel.
 * <p/>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 * <p/>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * <p/>
 * Created with IntelliJ IDEA.
 * User: faur
 * Date: 10/19/13
 * Time: 7:57 PM
 */
public interface ISimulator {

    /**
     * Gets the current clock value used by the simulator.
     *
     * @return an int value, greater than 0, representing the internal simulator clock value.
     */
    int getClock();

    /**
     * Starts the simulation;
     */
    void execute();

    /**
     * Stops the simulations.
     */
    void stopExecution();

    /**
     * Resets the simulations to the initial conditions.
     */
    void resetExecution();
}
