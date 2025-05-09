package com.github.anrimian.musicplayer.di.app.editor.composition

import com.github.anrimian.musicplayer.ui.editor.composition.CompositionEditorPresenter
import dagger.Subcomponent

@Subcomponent(modules = [ CompositionEditorModule::class ])
interface CompositionEditorComponent {
    fun compositionEditorPresenter(): CompositionEditorPresenter
}
