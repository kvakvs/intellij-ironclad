// This is a generated file. Not intended for manual editing.
package se.clau.ironclad.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ErlPsiFnDef extends PsiElement {

  @NotNull
  ErlPsiAtom getAtom();

  @NotNull
  List<ErlPsiExpr> getExprList();

  @NotNull
  List<ErlPsiFnDefArg> getFnDefArgList();

}
