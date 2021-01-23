package com.gjh.learn.idea.plugins;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.ide.CopyPasteManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleManager;

/**
 * created on 2021/1/23
 *
 * @author kevinlights
 */
public class HelloAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
        String classPath = psiFile.getVirtualFile().getPath();
        String title = "Hello World";
        Messages.showMessageDialog(project, classPath, title, Messages.getInformationIcon());

        PsiElement psiElement = e.getData(LangDataKeys.PSI_ELEMENT);
        CodeStyleManager manager = CodeStyleManager.getInstance(psiElement.getProject());
        manager.reformat(psiElement);

        // CopyPasteManager.getInstance().setContents();
    }
}
