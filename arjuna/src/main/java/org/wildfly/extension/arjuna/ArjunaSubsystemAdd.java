/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.wildfly.extension.arjuna;

import java.util.List;

import com.arjuna.ats.arjuna.AtomicAction;
import org.jboss.as.controller.AbstractBoottimeAddStepHandler;
import org.jboss.as.controller.OperationContext;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.as.controller.ServiceVerificationHandler;
import org.jboss.dmr.ModelNode;
import org.jboss.msc.service.ServiceController;
import org.wildfly.extension.arjuna.logging.ArjunaLogger;

/**
 *
 * @author <a href="mailto:paul.robinson@redhat.com">Paul Robinson</a>
 *
 */
final class ArjunaSubsystemAdd extends AbstractBoottimeAddStepHandler {

    static final ArjunaSubsystemAdd INSTANCE = new ArjunaSubsystemAdd();

    private ArjunaSubsystemAdd() {
    }

    @Override
    protected void populateModel(ModelNode operation, ModelNode model) throws OperationFailedException {
        ArjunaLogger.ROOT_LOGGER.info("Populate Model");
    }

    @Override
    public void performBoottime(OperationContext context, ModelNode operation, ModelNode model,
            ServiceVerificationHandler verificationHandler, List<ServiceController<?>> newControllers)
            throws OperationFailedException {

        ArjunaLogger.ROOT_LOGGER.info("Perform Boottime");

        AtomicAction A = new AtomicAction();
        BasicRecord rec = new BasicRecord();

        A.begin();
        A.add(rec);
        A.commit();

    }

}