package com.smarttoolfactory.home.postlist.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.smarttoolfactory.core.ui.adapter.NavigableFragmentStateAdapter
import com.smarttoolfactory.home.TestFragment

/**
 * FragmentStateAdapter to contain ViewPager2 fragments inside another fragment.
 *
 * * 🔥 Create FragmentStateAdapter with viewLifeCycleOwner instead of Fragment to make sure
 * that it lives between [Fragment.onCreateView] and [Fragment.onDestroyView] while [View] is alive
 *
 * * https://stackoverflow.com/questions/61779776/leak-canary-detects-memory-leaks-for-tablayout-with-viewpager2
 */
class PostPagesFragmentStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    NavigableFragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {

        return TestFragment()

//        return when (position) {
//
//            // Post List with Rxjava3
//            0 -> NavHostContainerFragment.createNavHostContainerFragment(
//                R.layout.fragment_navhost_post_list,
//                R.id.nested_nav_host_fragment_post_list
//            )
//
//            // Post List with Flow
//            1 -> NavHostContainerFragment.createNavHostContainerFragment(
//                R.layout.fragment_navhost_post_list,
//                R.id.nested_nav_host_fragment_post_list
//            )
//
//            // Post List with Status
//            else -> NavHostContainerFragment.createNavHostContainerFragment(
//                R.layout.fragment_navhost_post_list,
//                R.id.nested_nav_host_fragment_post_list
//            )
//        }
    }
}
