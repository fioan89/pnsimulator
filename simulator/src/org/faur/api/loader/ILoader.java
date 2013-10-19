package org.faur.api.loader;

import org.faur.api.model.IPlace;
import org.faur.api.model.ITransition;

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
 * Time: 6:41 PM
 */

import java.io.File;
import java.util.List;
public interface ILoader {
    /**
     * Gets the loaded list with every locations this petri net has.
     *
     * @return a list of locations contained by petri net.
     */
    List<IPlace> getPlaces();

    /**
     * Gets the loaded list of transitions.
     * @return a list of transitions contained by petri net.
     */
    List<ITransition> getTransitions();

    /**
     * Sets the location of a .properties file containing the petri network.

     * @param petriLocation a reference to the properties file containing the petri network,
     */
    void setPetriNetLocation(File petriLocation);

    /**
     * Forces the loading of the petri network.
     */
    void loadPetriNet();

    /**
     * Searches the locations with the given name and returns it.
     * @param name a unique string for the location you want to be searched.
     * @return if the location is found an <code>IPlace</code> is returned, null otherwise.
     */
    IPlace getPlace(String name);

    /**
     * Searches the transition with the given name and returns it.
     * @param name a unique string for the transition you want to be searched.
     * @return if the transition is found an <code>ITransition</code> is returned, null otherwise.
     */
    ITransition getTransition(String name);

}
