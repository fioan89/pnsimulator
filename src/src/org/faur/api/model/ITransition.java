package org.faur.api.model;

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
 * Time: 5:37 PM
 */

import java.util.List;

public interface ITransition {

    /**
     * Gets transition name.
     *
     * @return a string containing the transition name.
     */
    String getName();

    /**
     * Sets transition name.
     *
     * @param transitionName a string containing the transition name.
     */
    void setName(String transitionName);


    /**
     * Executes the transition if it is enabled, i.e there are sufficient tokens
     * in all of it's input places.
     *
     * @return <code>true</code> if the transition fired, <code>false</code> otherwise.
     */
    boolean fire();

    /**
     * Gets a list of the input places for this transition.
     *
     * @return a list with all the input places this transition is connected.
     */
    List<IPlace> getInputPlaces();

    /**
     * Sets a list of the input places for this transition.
     *
     * @param inputPlaces a list with the connected places as input.
     */
    void setInputPlaces(List<IPlace> inputPlaces);

    /**
     * Gets a list of the output places for this transition.
     *
     * @return a list with all the output places this transition is connected.
     */
    List<IPlace> getOutputPlaces();

    /**
     * Sets a list of the input places for this transition.
     *
     * @param outputPlaces a list with the connected places as output
     */
    void setOutputPlaces(List<IPlace> outputPlaces);

    /**
     * Sets the minimum and maximum time taken by the transition to be executed.
     *
     * @param minTime minimum time for execution
     * @param maxTime maximum time for execution.
     */
    void setTime(int minTime, int maxTime);

}
