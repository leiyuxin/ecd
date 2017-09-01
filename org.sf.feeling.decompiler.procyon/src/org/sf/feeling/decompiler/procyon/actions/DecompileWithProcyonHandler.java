/*******************************************************************************
 * Copyright (c) 2017 Chen Chao and other ECD project contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.sf.feeling.decompiler.procyon.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.sf.feeling.decompiler.actions.BaseDecompilerHandler;
import org.sf.feeling.decompiler.procyon.ProcyonDecompilerPlugin;

public class DecompileWithProcyonHandler extends BaseDecompilerHandler
{

	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		return handleDecompile( ProcyonDecompilerPlugin.decompilerType );
	}
}
