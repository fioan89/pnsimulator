package org.faur.model;

import org.faur.api.model.IPlace;
import org.faur.api.model.ITransition;

import java.util.ArrayList;
import java.util.List;

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
 * Time: 5:36 PM
 */
public class Transition implements ITransition {
    private String name;
    private int minTime;
    private int maxTime;
    private int time;
    List<IPlace> inputPlaces;
    List<IPlace> outputPlaces;

    public Transition(String name) {
        this.name = name;
        this.minTime = 0;
        this.maxTime = 1;
        this.time = 0;
        this.inputPlaces = new ArrayList<IPlace>();
        this.outputPlaces = new ArrayList<IPlace>();
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String transitionName) {
        this.name = transitionName;
    }

    @Override
    public boolean fire() {
        return false;
    }

    @Override
    public List<IPlace> getInputPlaces() {
        return inputPlaces;
    }

    @Override
    public void setInputPlaces(List<IPlace> inputPlaces) {
        this.inputPlaces = inputPlaces;
    }

    @Override
    public List<IPlace> getOutputPlaces() {
        return this.outputPlaces;
    }

    @Override
    public void setOutputPlaces(List<IPlace> outputPlaces) {
        this.outputPlaces = outputPlaces;
    }

    @Override
    public void setTime(int minTime, int maxTime) {
        if (minTime >= 0) {
            this.minTime = minTime;
        }

        if (maxTime >= this.minTime) {
            this.maxTime = maxTime;
        } else {
            this.minTime = 0;
            this.maxTime = 1;
        }

        this.time = this.minTime + (int)(Math.random() * this.maxTime);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name).append("[ ").append(String.valueOf(this.time)).append(" ]");
        return builder.toString();
    }
}
